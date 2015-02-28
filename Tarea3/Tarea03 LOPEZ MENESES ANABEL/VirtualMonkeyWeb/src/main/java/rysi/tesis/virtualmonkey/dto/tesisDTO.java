/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkey.dto;

/**
 *
 * @author Anny
 */
public class tesisDTO {
    
    private Integer anio;
    
    private int idautor;
    
    private String autor;
    
    private int idcondicionsitio;
    
    private String condicionsitio;
    
    private int iddirectortesis;
    
    private String directortesis;
    
    private int idespecieprimate;
    
    private String especieprimate;
    
    private int idestado;
    
    private String estado;
    
    private int idgradoobtenido;
    
    private String gradoobtenido;
    
    private int idinstitucion;
    
    private String institucion;
    
    private int idsubdisciplina;
    
    private String subdisciplina;
    
    private String titulo;
    
    private Integer id;

    public tesisDTO() {
    }

    public tesisDTO(Integer id) {
        this.id = id;
    }

    public tesisDTO(Integer id, int idautor, int idcondicionsitio, int iddirectortesis, int idespecieprimate, int idestado, int idgradoobtenido, int idinstitucion, int idsubdisciplina) {
        this.id = id;
        this.idautor = idautor;
        this.idcondicionsitio = idcondicionsitio;
        this.iddirectortesis = iddirectortesis;
        this.idespecieprimate = idespecieprimate;
        this.idestado = idestado;
        this.idgradoobtenido = idgradoobtenido;
        this.idinstitucion = idinstitucion;
        this.idsubdisciplina = idsubdisciplina;
    }
    
    public tesisDTO(Integer id, int anio, int idautor, String autor, 
            int idcondicionsitio, String condicionsitio, 
            int iddirectortesis, String directortesis, 
            int idespecieprimate, String especieprimate, 
            int idestado, String estado, 
            int idgradoobtenido, String gradoobtenido, 
            int idinstitucion, String institucion, 
            int idsubdisciplina, String subdisciplina, String titulo) {
        this.id = id;
        this.anio = anio;
        this.idautor = idautor;
        this.autor=autor;
        this.idcondicionsitio = idcondicionsitio;
        this.condicionsitio = condicionsitio;
        this.iddirectortesis = iddirectortesis;
        this.directortesis = directortesis;
        this.idespecieprimate = idespecieprimate;
        this.especieprimate = especieprimate;
        this.idestado = idestado;
        this.estado = estado;
        this.idgradoobtenido = idgradoobtenido;
        this.gradoobtenido = gradoobtenido;
        this.idinstitucion = idinstitucion;
        this.institucion = institucion;
        this.idsubdisciplina = idsubdisciplina;
        this.subdisciplina = subdisciplina;
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer Anio) {
        this.anio = Anio;
    }

    
    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }


    public int getIdcondicionsitio() {
        return idcondicionsitio;
    }

    public void setIdcondicionsitio(int idcondicionsitio) {
        this.idcondicionsitio = idcondicionsitio;
    }
    
    public String getCondicionsitio() {
        return condicionsitio;
    }

    public void setCondicionsitio(String Condicionsitio) {
        this.condicionsitio = Condicionsitio;
    }

    public int getIddirectortesis() {
        return iddirectortesis;
    }

    public void setIddirectortesis(int iddirectortesis) {
        this.iddirectortesis = iddirectortesis;
    }
    
    public String getDirectortesis() {
        return directortesis;
    }

    public void setDirectortesis(String Directortesis) {
        this.directortesis = Directortesis;
    }

    public int getIdespecieprimate() {
        return idespecieprimate;
    }

    public void setIdespecieprimate(int idespecieprimate) {
        this.idespecieprimate = idespecieprimate;
    }
    
    public String getEspecieprimate() {
        return especieprimate;
    }

    public void setEspecieprimate(String Especieprimate) {
        this.especieprimate = Especieprimate;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    public int getIdgradoobtenido() {
        return idgradoobtenido;
    }

    public void setIdgradoobtenido(int idgradoobtenido) {
        this.idgradoobtenido = idgradoobtenido;
    }
    
     public String getGradoobtenido() {
        return gradoobtenido;
    }

    public void setGradoobtenido(String Gradoobtenido) {
        this.gradoobtenido = Gradoobtenido;
    }

    public int getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(int idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String Institucion) {
        this.institucion = Institucion;
    }
    
    public int getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(int idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }
    
    public String getSubdisciplina() {
        return subdisciplina;
    }

    public void setSubdisciplina(String Subdisciplina) {
        this.subdisciplina = Subdisciplina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
