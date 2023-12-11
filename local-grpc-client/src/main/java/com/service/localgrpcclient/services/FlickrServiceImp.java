package com.service.localgrpcclient.services;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.uploader.UploadMetaData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FlickrServiceImp  implements FlickrService {

    @Autowired
    private Flickr flickr;



    @Override
    public String savePhoto(byte[] imageBytes) throws FlickrException {
        String title = imageBytes.toString();
        UploadMetaData uploadMetaData = new UploadMetaData();
        uploadMetaData.setTitle(title);


        String photoId = flickr.getUploader().upload(imageBytes, uploadMetaData);
        return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
    }

}
