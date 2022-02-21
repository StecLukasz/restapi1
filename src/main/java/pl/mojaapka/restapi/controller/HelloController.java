//package pl.mojaapka.restapi.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import pl.mojaapka.restapi.service.HelloService;
//
//@RestController
//@RequiredArgsConstructor  // jeśli nie używamy konstruktora to wtedy wpisujemy to. Natomiast jeśli chcesz konstruktor
//// to nie trzeba używać @Autowired  bo on sam w sobie to juz zawiera
//public class HelloController {
//
////@Autowired
//    private final HelloService helloService;
//
//
//    @GetMapping("/")
//    public String hello() {
//        return helloService.hello();
//    }
//
//}
