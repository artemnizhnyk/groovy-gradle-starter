package com.artemnizhnyk

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }
}