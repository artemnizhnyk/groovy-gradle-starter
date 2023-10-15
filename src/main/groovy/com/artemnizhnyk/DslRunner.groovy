package com.artemnizhnyk

import javax.swing.JTextArea
import static com.artemnizhnyk.DslBuilder.*
//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTtile("title")
//
//def body = new EmailBody()
//body.setText("asdasd")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)

//builder
mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images (['image.jpg', 'image2.png'])
    }
}