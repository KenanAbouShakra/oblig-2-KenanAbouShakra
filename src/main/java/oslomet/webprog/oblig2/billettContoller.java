package oslomet.webprog.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class billettContoller {
    private final List<Billett> alleBillettene=new ArrayList<>();
    @PostMapping("/lagre")
public void lagreBillettene(Billett billett){
        alleBillettene.add(billett);
    }
    @GetMapping("/hentAlle")
public List<Billett> hentAlle(){
        return alleBillettene;
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleBillettene.clear();
        }
}
