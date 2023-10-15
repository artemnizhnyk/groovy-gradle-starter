package com.artemnizhnyk

class BodySpecification {
    String text
    List<String> images = []

    def text(final String text) {
        this.text = text
    }

    def images(final List<String> images) {
        this.images += images
    }

    def images(final String image) {
        images << image
    }
}
