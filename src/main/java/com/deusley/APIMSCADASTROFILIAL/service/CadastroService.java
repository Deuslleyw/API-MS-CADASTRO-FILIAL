package com.deusley.APIMSCADASTROFILIAL.service;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.provider.model.CrateFilialRequestVO;

public interface CadastroService {

    Cadastro create (CrateFilialRequestVO cadastro);

}
