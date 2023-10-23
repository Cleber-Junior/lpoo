package model;

import java.sql.Date;
import java.sql.Time;


public class Locacao {

    private Date dataLocacao;
    private Time horaLocacao;
    private Date DataDevolucao;
    private Time horaDevolucao;
    private Integer quilometragem;
    private Double calorCalcao;
    private Double valor_locacao;
    private Boolean devolvido;

    public Locacao(){
    }

    public Locacao(Date dataLocacao, Time horaLocacao,
                   Date dataDevolucao, Time horaDevolucao,
                   Integer quilometragem, Double calorCalcao,
                   Double valor_locacao, Boolean devolvido) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        DataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.calorCalcao = calorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Time getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Time horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public Date getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getCalorCalcao() {
        return calorCalcao;
    }

    public void setCalorCalcao(Double calorCalcao) {
        this.calorCalcao = calorCalcao;
    }

    public Double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(Double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", DataDevolucao=" + DataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", calorCalcao=" + calorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
