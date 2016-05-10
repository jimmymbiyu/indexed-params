package com.frontlinesms

/**
 * @author Ndung'u Mbiyu
 * @date 18/03/2016.
 */
class AuthorController {

    def authorService

    def index() {
        render(view: "create-author")
    }

    def save(AuthorCommand authorCommand) {
        println authorCommand.toString()
        authorService.save(authorCommand)
        render(view: "create-author")
    }
}
