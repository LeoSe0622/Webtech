package Webtech.htw.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Controller {

    @GetMapping("/")
    public List<Entry> index() {
        return List.of(new Entry("M1"), new Entry("M2"),new Entry("M3"),new Entry("M4"));
    }

    }
