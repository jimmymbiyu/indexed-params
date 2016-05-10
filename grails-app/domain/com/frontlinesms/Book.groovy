package com.frontlinesms

/**
 * @author Ndung'u Mbiyu
 * @date 18/3/2016s
 */
class Book {

	String name
	String genre
	static constraints = {
	}

	boolean equals(o) {
		if (this.is(o)) return true
		if (getClass() != o.class) return false

		Book book = (Book) o

		if (genre != book.genre) return false
		if (name != book.name) return false

		return true
	}

	int hashCode() {
		int result
		result = (name != null ? name.hashCode() : 0)
		result = 31 * result + (genre != null ? genre.hashCode() : 0)
		return result
	}
}
