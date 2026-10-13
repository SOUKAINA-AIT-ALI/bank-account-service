package org.sdia.bank_account_service.service;

import org.sdia.bank_account_service.dto.BankAccountRequestDTO;
import org.sdia.bank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
     BankAccountResponseDTO addAccount (BankAccountRequestDTO bankAccountDTO);
}
