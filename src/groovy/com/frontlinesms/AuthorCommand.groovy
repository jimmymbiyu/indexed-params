package com.frontlinesms

/**
 * @author Ndung'u Mbiyu
 * @date 18/03/2016.
 */
class AuthorCommand {

	String name
	List<BookCommand> books

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("AuthorCommand{");
		sb.append("name='").append(name).append('\'');
		sb.append(", books=").append(books);
		sb.append('}');
		return sb.toString();
	}
}
