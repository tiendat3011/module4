package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import product.model.Product;
import product.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String showListProduct(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(Product product) {
        product.setId(productService.findAll().get(productService.findAll().size() - 1).getId() + 1);
        productService.create(product);
        return "redirect:/index";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.delete(product.getId());
        redirect.addAttribute("message", "Xoa Thanh Cong!");

        return "redirect:/index";
    }

    @GetMapping("/search")
    public String search(String nameProduct, Model model) {
        model.addAttribute("productList", productService.search(nameProduct));
        return "index";
    }
}
