package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.model;
import br.edu.utfpr.dv.sireata.dao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PautaController {

    private final PautaDAO pautaDAO;

    @GetMapping("/pauta")
    public String listarPorAta(Model memoria) {
        return pautaDAO.listaPorAta(idAta));
    }

    @PostMapping("/pauta/salvar")
    public String salvar(Pauta pauta) {
        return pautaDAO.salvar(pauta);
    }

}
