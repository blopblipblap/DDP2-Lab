package com.ddp2.lab10rabu;

import com.ddp2.lab10rabu.model.Donatur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index(Model model) {
        // TODO: pass variabel yang diperlukan untuk thymeleaf di URL /
        model.addAttribute("namaKamu", "Vanessa");
        return "index";
    }

    @GetMapping("/form-donasi")
    public String formDonasi(Model model) {
        // TODO: pass variabel yang diperlukan untuk thymeleaf di URL /form-donasi
        model.addAttribute("donatur", new Donatur());
        return "form-donasi";
    }

    @PostMapping("/form-donasi")
    public String submitFormDonasi(@ModelAttribute Donatur donatur) {
        // TODO: tambahkan donatur yang diisi di form ke dalam daftar donatur
        Donatur.addDonatur(donatur);
        return "hasil-form-donasi";
    }

    // TODO: tambahkan mapping daftar donatur dan total donasi
    
    @GetMapping("/daftar-donatur")
    public String daftarDonatur(Model model) {
        List<Donatur> donatur = Donatur.getDaftarDonatur();
        model.addAttribute("daftarDonatur", donatur);
        return "daftar-donatur";
    }
    
    @GetMapping("/total-donasi")
    public String totalDana(Model model) {
        model.addAttribute("totalDana", Donatur.getTotalDana());
        model.addAttribute("totalDonatur", Donatur.getTotalDonatur());
        return "total-donasi";
    }
}