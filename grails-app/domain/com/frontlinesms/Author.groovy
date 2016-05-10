package com.frontlinesms

/**
 * @author Ndung'u Mbiyu
 * @date 18/3/2016s
 */
class Author {

	String name

	static constraints = {
	}

	static hasMany = [books: Book]
}
