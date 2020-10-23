package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;

public class DesafioAutomacaoTest extends BaseTest {

    String nome ="Aline";
    String sobrenome = "Zanin";
    String sugestoes = "colocar o codigo no git";


    @Test
    public void deveCadastrarPessoa(){
        DesafioCadastroPage page = new DesafioCadastroPage(getDriver());
        page.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .clicarSexo()
                .clicarComidaCarne()
                .clicarComidaFrango()
                .clicarComidaPizza()
                .clicarComidaVegetariano()
                .selecionarEsporteKarate()
                .preencherSugestao(sugestoes)
               .clicarCadastrar();
        Assert.assertEquals(page.capturarResultado(), "Cadastrado!");

        /*Na classe Page identificar os elementos que contem os resultados finais do cadastro
        * e criar os métodos que capturam os valores destes elementos.
        * Na classe de teste criar os Assert que verificam o resultado para os campo
        * Nome:  Sobrenome:  Sexo: Masculino Comida: Carne Frango Pizza  Esportes: Sugestoes: */
    }




    @Test
    public void deveCadastrarPessoaExemplo(){
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());
                 cp.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .clicarCadastrar();
    }





}
