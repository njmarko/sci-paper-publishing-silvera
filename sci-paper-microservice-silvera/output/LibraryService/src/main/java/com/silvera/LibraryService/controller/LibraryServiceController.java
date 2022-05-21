/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-21 11:29:00
*/

package com.silvera.LibraryService.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.silvera.LibraryService.service.base.ILibraryServiceService;
import com.silvera.LibraryService.domain.model.*;



@RefreshScope
@RestController
public class LibraryServiceController {

    @Autowired
    ILibraryServiceService libraryServiceService;

    // Auto-generated CRUD methods
    



    
        
    

    @GetMapping(value="listallpapers")


    @ResponseBody
    public java.util.List<PublishedPaper> listAllPapers() {
        
        return libraryServiceService.listAllPapers();

    }
    

}