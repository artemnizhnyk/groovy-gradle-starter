package com.artemnizhnyk

class ListRunner {
    static void main(String[] args) {
        def list = [1, 7, 4, 9]
        assert  list.getClass() == ArrayList

        //read
        assert list[2] == 4
        assert list.get(2) == 4
        assert list[-1] == 9
        assert list[1..3] == [7, 4 ,9]
        assert list[8] == null

        //write
        list += 9
        list << 11 << 13 << 7
        assert  list == [1, 7, 4, 9, 9, 11, 13, 7]
        list -= 7
        assert  list == [1, 4, 9, 9, 11, 13]
        list -= [1, 3]
        assert  list == [4, 9, 9, 11, 13]
        list *= 3
        assert list == [4, 9, 9, 11, 13, 4, 9, 9, 11, 13, 4, 9, 9, 11, 13]

        //methods from queue
        list.push(999)
        println(list)
        def pop = list.pop()
        println list
        assert list.head() == 4
        assert list.tail() == [9, 9, 11, 13, 4, 9, 9, 11, 13, 4, 9, 9, 11, 13]
        assert list.last() == 13

        //flatten, reverse, intersect, disjoint
        assert [1, 2, [4, 6, 8], 9].flatten() == [1, 2, 4, 6, 8, 9]
        assert [1, 2, 3].reverse() == [3, 2 ,1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6, 7])

        //new operators
        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7

        func(*[1, 7])
    }
        static def func(def a, def b) {
            println a
            println b
        }

}
