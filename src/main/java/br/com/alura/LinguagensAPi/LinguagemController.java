package br.com.alura.LinguagensAPi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    
    // private List<Linguagem> linguagens = List.of(
    //     new Linguagem("python","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", 1),
    //     new Linguagem("kotlin","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/kotlin/kotlin_256x256.png",2)

    // );
    @Autowired
    private LinguagemRepository repositorio;


//    @GetMapping(value="/linguagem-preferida")
//    public String processaLinguagemPreferida(){
//         return "Oi, Java!";
//    }

   @GetMapping("/linguagens")
   public List<Linguagem> obterLinguagens(){
    List<Linguagem> linguagens = repositorio.findAll();//do BD
    return linguagens;
   }
    
   @PostMapping("linguagens")
   public Linguagem cadastraLinguagem(@RequestBody Linguagem linguagem){
    Linguagem linguagemsalva=repositorio.save(linguagem);
    return linguagemsalva;
   }


}
