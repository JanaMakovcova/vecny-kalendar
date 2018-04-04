package cz.czechitas.webapp;

import java.time.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import java.time.temporal.ChronoUnit;

@Controller
public class HlavniController {

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public ModelAndView zobrazIndex(){
        return new ModelAndView("index");
    }
    @RequestMapping(value ="/", method = RequestMethod.POST)
    public ModelAndView zpracujDatum(DatumNarozeni zadaneDatumNarozeni){
        LocalDate datum1;
        Long datum2;
        LocalDate datumPrumerneSmrti;
        int ZENYPRUMER = 76;
        int MUZIPRUMER = 82;
        datum1 = LocalDate.of(zadaneDatumNarozeni.getRok(), zadaneDatumNarozeni.getMesic(), zadaneDatumNarozeni.getDen());
        long dnuMezi = ChronoUnit.DAYS.between(datum1, LocalDate.now());
        if(zadaneDatumNarozeni.isZena()) {
            datumPrumerneSmrti = datum1.plusYears(MUZIPRUMER);
        } else {
            datumPrumerneSmrti = datum1.plusYears(ZENYPRUMER);
        }
        long dnuDoSmrti = ChronoUnit.DAYS.between(LocalDate.now(), datumPrumerneSmrti);

        ModelAndView drzakNaDatumASablonu = new ModelAndView("kalendar");
        drzakNaDatumASablonu.addObject("dnesek", LocalDate.now());
        drzakNaDatumASablonu.addObject("datumZadane", datum1);
        drzakNaDatumASablonu.addObject("dnu", dnuMezi);
        drzakNaDatumASablonu.addObject("dnuSmrt", dnuDoSmrti);

        return drzakNaDatumASablonu;
    }


}
