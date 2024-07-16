package com.xclone.xclone.mapper;

import com.xclone.xclone.dto.MediaDTO;
import com.xclone.xclone.model.Media;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper {
    MediaDTO toMediaDTO(Media media);
    List<MediaDTO> userListToMediaDTOList(List<Media> list);
    Media fromMediaDTO(MediaDTO mediaDTO);
}
