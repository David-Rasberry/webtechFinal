package webtech.controller;


import webtech.domain.Book;
import webtech.service.BookService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class BookControllerTest {
    @Mock
    BookService artifactService;
    @InjectMocks
    BookController controller;

    List<Book> list;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        Book a1 = new Book();
        a1.setId("1250808601736515584");
        a1.setBookName("Harry Potter and the Sorcerer’s Stone");
        a1.setDescription("Harry finds some stones");
        a1.setAuthor("J.K. Rawlings");

        Book a2 = new Book();
        a2.setId("1250808601736516943");
        a2.setBookName("Harry Potter and the Chamber of Secrets");
        a2.setDescription("Harry finds out secrets");
        a2.setAuthor("J.K. Rawlings");
        list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() throws Exception {
        when(artifactService.findAll()).thenReturn(list);
        mockMvc.perform(MockMvcRequestBuilders.get("/artifacts").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(jsonPath("$.data", hasSize(2)))
                .andExpect(jsonPath("$.data[0].id").value(("1250808601736515584"))).andExpect(jsonPath("$.data[0].name").value("Deluminator"))
                .andExpect(jsonPath("$.data[1].id").value("1250808601744904193"))
                .andExpect(jsonPath("$.data[1].name").value("Invisibility Cloak"));
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}