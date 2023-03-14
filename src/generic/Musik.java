/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author idham
 */
public class Musik {
    String path, filename, fileSize, extension;
    
    public Musik(Stringp p, String fn, String fs, String e) {
        this.path = p;
        this.filename = fn;
        this.fileSize = fs;
        this.extension = e;
    }

    public String getPath() {
        return path;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getExtension() {
        return extension;
    }
    
}
