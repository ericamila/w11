/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package erica.controle;

import erica.negocio.Consumo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author erica
 */
@ManagedBean
@RequestScoped
public class ConsumoBean {

    public Integer jan;
    public Integer fev;
    public Integer mar;
    public Integer abr;
    public Integer mai;
    public Integer jun;
    public Integer jul;
    public Integer ago;
    public Integer set;
    public Integer out;
    public Integer nov;
    public Integer dez;
    public Integer total = 0;
    public Integer[] meses = new Integer[12];
    public String maior = "";
    public String menor = "";

    public ConsumoBean() {
        meses[0] = jan;
        meses[1] = fev;
        meses[2] = mar;
        meses[3] = abr;
        meses[4] = mai;
        meses[5] = jun;
        meses[6] = jul;
        meses[7] = ago;
        meses[8] = set;
        meses[9] = out;
        meses[10] = nov;
        meses[11] = dez;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer[] getMeses() {
        return meses;
    }

    public void setMeses(Integer[] meses) {
        this.meses = meses;
    }

    public String getMaior() {
        return maior;
    }

    public void setMaior(String maior) {
        this.maior = maior;
    }

    public String getMenor() {
        return menor;
    }

    public void setMenor(String menor) {
        this.menor = menor;
    }

    public Integer getJan() {
        return jan;
    }

    public void setJan(Integer jan) {
        this.jan = jan;
    }

    public Integer getFev() {
        return fev;
    }

    public void setFev(Integer fev) {
        this.fev = fev;
    }

    public Integer getMar() {
        return mar;
    }

    public void setMar(Integer mar) {
        this.mar = mar;
    }

    public Integer getAbr() {
        return abr;
    }

    public void setAbr(Integer abr) {
        this.abr = abr;
    }

    public Integer getMai() {
        return mai;
    }

    public void setMai(Integer mai) {
        this.mai = mai;
    }

    public Integer getJun() {
        return jun;
    }

    public void setJun(Integer jun) {
        this.jun = jun;
    }

    public Integer getJul() {
        return jul;
    }

    public void setJul(Integer jul) {
        this.jul = jul;
    }

    public Integer getAgo() {
        return ago;
    }

    public void setAgo(Integer ago) {
        this.ago = ago;
    }

    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    public Integer getOut() {
        return out;
    }

    public void setOut(Integer out) {
        this.out = out;
    }

    public Integer getNov() {
        return nov;
    }

    public void setNov(Integer nov) {
        this.nov = nov;
    }

    public Integer getDez() {
        return dez;
    }

    public void setDez(Integer dez) {
        this.dez = dez;
    }

    private String Mes(Integer m) {
        switch (m) {
            case 0:
                return "Janeiro";
            case 1:
                return "Fevereiro";
            case 2:
                return "Março";
            case 3:
                return "Abril";
            case 4:
                return "Maio";
            case 5:
                return "Junho";
            case 6:
                return "Julho";
            case 7:
                return "Agosto";
            case 8:
                return "Setembro";
            case 9:
                return "Outubro";
            case 10:
                return "Novembro";
            case 11:
                return "Dezembro";
            default:
                return null;
        }
    }

    public String Calculate() {
        Consumo c = new Consumo();
        setMaior(c.calcMaior(jan, fev, mar, abr, mai, jun, jul, ago, set, out, nov, dez));
        setMenor(c.calcMenor(jan, fev, mar, abr, mai, jun, jul, ago, set, out, nov, dez));
        setTotal(c.calcTotal(jan, fev, mar, abr, mai, jun, jul, ago, set, out, nov, dez));
        return "result.xhtml";
    }

    public String Voltar() {
        return "./index.xhtml";
    }
}
