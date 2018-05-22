import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomATronController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        final RandomATron classNames = new RandomATron();

        get("/main", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("template", "main.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/one", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            classNames.shuffleNames();
            model.put("person", classNames.single());
            model.put("template", "single.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (rew, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            classNames.shuffleNames();
            model.put("double", classNames.pairs());
            model.put("template", "pair.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
//
//        get("/new", (req, res) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("template", "new.vtl");
//            return new ModelAndView(model, "layout.vtl");
//        }, velocityTemplateEngine);
    }
}
