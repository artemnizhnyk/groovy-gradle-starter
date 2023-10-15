package com.artemnizhnyk

class MailSpecification {
    String from
    String to
    String title
    BodySpecification body

    def from(final String from) {
        this.from = from
    }

    def to(final String to) {
        this.to = to
    }

    def title(final String title) {
        this.title = title
    }

    def body(@DelegatesTo(BodySpecification) Closure closure) {
        body = new BodySpecification()
        body.with closure
    }

}
