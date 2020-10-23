package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastroPage extends BasePage {


    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }


     @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;

    @FindBy(name = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;

    @FindBy(xpath = "//*[@id=\"elementosForm:sexo:1\"]")
    private WebElement sexoRadioButton;

    @FindBy(linkText = "Voltar")
    private WebElement voltar;

    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;

    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement comidaFavoritaCarneCheckBox;
    @FindBy(id = "elementosForm:comidaFavorita:1")
    private WebElement comidaFavoritaFrangoCheckBox;
    @FindBy(id = "elementosForm:comidaFavorita:2")
    private WebElement comidaFavoritaPizzaCheckBox;
    @FindBy(id = "elementosForm:comidaFavorita:3")
    private WebElement comidaFavoritaVegetarianoCheckBox;

    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[1]")
    private WebElement esporteNatacaoSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[2]")
    private WebElement esporteFutebolSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[3]")
    private WebElement esporteCorridaSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[4]")
    private WebElement esporteKarateSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[5]")
    private WebElement esporteOqueehesporteSelectOption;

    @FindBy(xpath = "//*[@id=\"resultado\"]/span")
    private WebElement cadastrarLabel;

    @FindBy(id ="elementosForm:sugestoes")
    private WebElement sugestoesTextArea;


    public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }
    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }

    public DesafioCadastroPage clicarSexo() {
        sexoRadioButton.click();
        return this;
    }

    public DesafioCadastroPage clicarCadastrar(){
        cadastrarButton.click();
        return this;
    }

    public DesafioCadastroPage clicarComidaCarne(){
        comidaFavoritaCarneCheckBox.click();
        return this;
    }

    public DesafioCadastroPage clicarComidaFrango(){
        comidaFavoritaFrangoCheckBox.click();
        return this;
    }

    public DesafioCadastroPage clicarComidaPizza(){
        comidaFavoritaPizzaCheckBox.click();
        return this;
    }

    public DesafioCadastroPage clicarComidaVegetariano(){
        comidaFavoritaVegetarianoCheckBox.click();
        return  this;
    }


    public DesafioCadastroPage selecionarEsporteKarate(){
        esporteKarateSelectOption.click();
        return this;
    }

    public DesafioCadastroPage preencherSugestao(String sugestao){
        sugestoesTextArea.sendKeys(sugestao);
        return this;
    }


    public String capturarResultado(){
        String resultado = sugestoesTextArea.getText();
        return resultado;
    }
}
