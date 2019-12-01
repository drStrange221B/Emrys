package com.inc.emrys.rojaya.controllers;

import com.inc.emrys.rojaya.model.Book;
import com.inc.emrys.rojaya.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {


    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
   }

    @RequestMapping("/books")
    public String getBooks(Model model)
    {
        model.addAttribute("books", bookRepository.findAll());

       List<Book>  books=(List<Book>)bookRepository.findAll();

        return "books";
    }
}
