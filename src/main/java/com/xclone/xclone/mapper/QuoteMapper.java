package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.QuoteDTO;
import com.xclone.xclone.model.Quote;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface QuoteMapper {
    QuoteDTO toQuoteDTO(Quote quote);
    List<QuoteDTO> userListToQuoteDTOList(List<Quote> list);
    Quote fromQuoteDTO(QuoteDTO quoteDTO);
}
