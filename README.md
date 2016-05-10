# indexed-params
A simple Grails application that demonstrates how to better model request parameters with nested object structures. This example has a form where you add an author and a list of books written by this author. Of interest is the structure of the HTML form and how the submitted request is marshalled in the controller using command objects.

The following files may be of interest.
- The com.frontlinesms.Author and com.frontlinesms.Book where an Author has many books.
- grails-app/views/author/create-author.gsp showing the form.
- The command objects com.frontlinesms.AuthorCommand and com.frontlinesms.BookCommand
