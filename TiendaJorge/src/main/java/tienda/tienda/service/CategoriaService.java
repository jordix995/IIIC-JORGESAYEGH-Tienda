package tienda.tienda.service;
import tienda.tienda.domain.Categoria;
import java.util.List;
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);

}
