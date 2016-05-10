package com.frontlinesms

/**
 * @author Ndung'u Mbiyu
 * @date 18/03/2016.
 */
class BookCommand {

	String name
	String genre

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BookCommand{");
		sb.append("name='").append(name).append('\'');
		sb.append(", genre='").append(genre).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
