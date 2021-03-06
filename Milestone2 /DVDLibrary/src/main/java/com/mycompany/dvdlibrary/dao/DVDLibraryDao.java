/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.dao;

import com.mycompany.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author shaharfin
 */
public interface DVDLibraryDao {
    
    /**
     * Adds the given DVD to the collection and associates it with the given
     * student title. If there is already a DVD associated with the given
     * title it will return that DVD object, otherwise it will
     * return null.
     *
     * @param title with which DVD is to be associated
     * @param dvd DVD to be added to the collection
     * @return the DVD object previously associated with the given
     * title if it exists, null otherwise
     */
    
    DVD addDVD(String title, DVD dvd) throws DVDLibraryDaoException;

    /**
     * Returns a List of all DVDs in the library.
     *
     * @return List containing all DVDs in the library.
     */
    
    List<DVD> getAllDVDs() throws DVDLibraryDaoException;

    /**
     * Returns the DVD object associated with the given title.
     * Returns null if no such DVD exists
     *
     * @param title DVD title to retrieve
     * @return the DVD object associated with the given DVD title,
     * null if no such DVD exists
     */
    
    DVD getDVD(String title) throws DVDLibraryDaoException;

    /**
     * Removes from the library the DVD associated with the title.
     * Returns the DVD object that is being removed or null if
     * there is no DVD associated with the given title
     *
     * @param title title of the DVD to be removed
     * @return DVD object that was removed or null if no DVD
     * was associated with the given title
     */
    
    DVD removeDVD(String title) throws DVDLibraryDaoException;

    /**
     * Edits the DVD object associated with the given title.
     * Returns null if no such DVD exists
     *
     * @param title DVD title to edit
     * @param dvd DVD to be replaced to the collection
     * @return the edited DVD object associated with the given DVD title,
     * null if no such DVD exists
     */
    
    DVD editDVD(String title, DVD dvd) throws DVDLibraryDaoException;
    
}
