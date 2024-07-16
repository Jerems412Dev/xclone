package com.xclone.xclone.service;

import com.xclone.xclone.dto.QuoteDTO;
import com.xclone.xclone.mapper.QuoteMapper;
import com.xclone.xclone.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quoterepos;
    @Autowired
    private QuoteMapper quotemapper;

    public List<QuoteDTO> getAllQuotes() {
        return quotemapper.userListToQuoteDTOList(quoterepos.findAll());
    }

    public QuoteDTO getQuoteById(int id) {
        return quotemapper.toQuoteDTO(quoterepos.findById(id).get());
    }

    public void createQuote(QuoteDTO quote) {
        quoterepos.save(quotemapper.fromQuoteDTO(quote));
    }
}
