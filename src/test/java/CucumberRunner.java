import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//       прописываем путь к папке с тестами
        features = "src/test/resources/features",
//        прописываем путь к папке с шагами
        glue = "src.test.java.steps"
)

public class CucumberRunner {

}
