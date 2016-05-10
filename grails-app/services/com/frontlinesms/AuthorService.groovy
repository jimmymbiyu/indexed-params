package com.frontlinesms

import grails.transaction.Transactional

/**
 * @author Ndung'u Mbiyu
 * @date 18/03/2016.
 */
@Transactional
class AuthorService {

    Author save(AuthorCommand authorCommand) {
        Author author = new Author(name: authorCommand.name)
        List<BookCommand> bookCommands = authorCommand.books
        for (BookCommand bookCommand : bookCommands) {
            Book book = new Book(name: bookCommand.name, genre: bookCommand.genre)
            author.addToBooks(book)
        }

        return author.save()
    }
}
