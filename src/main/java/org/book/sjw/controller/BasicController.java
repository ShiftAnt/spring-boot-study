package org.book.sjw.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.book.sjw.dto.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public Todo basic() {
		return new Todo(counter.incrementAndGet(), "라면 먹고싶당");
	}
}