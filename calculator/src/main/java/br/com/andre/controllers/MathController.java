package br.com.andre.controllers;

import br.com.andre.SimpleMath.SimpleMath;
import br.com.andre.exception.UnsuportedMathOperationException;
import br.com.andre.validacao.Validacao;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static br.com.andre.validacao.Validacao.*;

@RestController
public class MathController {

    @Autowired
    SimpleMath simpleMath;

    @SneakyThrows
    //@RequestMapping(value = "/sum/{numberOne}/{numbertwo}", method = RequestMethod.GET)
    @GetMapping (value = "/Sum/{numberOne}/{numbertwo}")
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numbertwo") String numbertwo) {

        if (!isNumeric(numberOne) || !isNumeric(numbertwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return simpleMath.sum(convertToDouble(numberOne), convertToDouble(numbertwo));
    }

    @SneakyThrows
    //@RequestMapping(value = "/sum/{numberOne}/{numbertwo}", method = RequestMethod.GET)
    @GetMapping (value = "/Sub/{numberOne}/{numbertwo}")
    public Double Sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numbertwo") String numbertwo) {

        if (!isNumeric(numberOne) || !isNumeric(numbertwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return simpleMath.sub(convertToDouble(numberOne), convertToDouble(numbertwo));
    }

    @SneakyThrows
    //@RequestMapping(value = "/sum/{numberOne}/{numbertwo}", method = RequestMethod.GET)
    @GetMapping (value = "/mult/{numberOne}/{numbertwo}")
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numbertwo") String numbertwo) {

        if (!isNumeric(numberOne) || !isNumeric(numbertwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return simpleMath.mult(convertToDouble(numberOne), convertToDouble(numbertwo));
    }

    @SneakyThrows
    //@RequestMapping(value = "/sum/{numberOne}/{numbertwo}", method = RequestMethod.GET)
    @GetMapping (value = "/div/{numberOne}/{numbertwo}")
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numbertwo") String numbertwo) {

        if (!isNumeric(numberOne) || !isNumeric(numbertwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return simpleMath.div(convertToDouble(numberOne), convertToDouble(numbertwo));
    }

    @SneakyThrows
    //@RequestMapping(value = "/sum/{numberOne}/{numbertwo}", method = RequestMethod.GET)
    @GetMapping (value = "/med/{numberOne}/{numbertwo}")
    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numbertwo") String numbertwo) {

        if (!isNumeric(numberOne) || !isNumeric(numbertwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return simpleMath.med(convertToDouble(numberOne), convertToDouble(numbertwo));
    }

    @SneakyThrows
    //@RequestMapping(value = "/sum/{numberOne}/{numbertwo}", method = RequestMethod.GET)
    @GetMapping (value = "/raiz/{numberOne}")
    public Double raiz(
            @PathVariable(value = "numberOne") String numberOne) {

        if (!isNumeric(numberOne)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return simpleMath.raiz(convertToDouble(numberOne));
    }



}
