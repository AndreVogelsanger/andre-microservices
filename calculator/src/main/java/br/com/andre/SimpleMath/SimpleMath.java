package br.com.andre.SimpleMath;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

    public Double sum (Double n1 ,Double n2){
        return n1 + n2;
    }

    public Double sub (Double n1 ,Double n2){
        return n1 - n2;
    }

    public Double mult (Double n1 ,Double n2){
        return n1 * n2;
    }

    public Double div (Double n1 ,Double n2){
        return n1 / n2;
    }

    public Double med (Double n1 ,Double n2){
        return (n1 + n2) / 2;
    }

    public Double raiz (Double n1){
        return Math.sqrt(n1) ;
    }

}
