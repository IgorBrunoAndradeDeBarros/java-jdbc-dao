package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    private Integer id;
    private String name;
    private static final long serialVersionUID = 1L;

    // Construtor: cria o objeto já preenchendo id e name
    // @AllArgsConstructor faria isso automaticamente
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter: método que "pega" (retorna) o valor do id
    // @Getter faria isso automaticamente (pode ir na classe toda ou só no campo)
    public Integer getId() {
        return id;
    }

    // Setter: método que "define" (altera) o valor do id
    // @Setter faria isso automaticamente
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter: método que "pega" (retorna) o valor do name
    // @Getter faria isso automaticamente
    public String getName() {
        return name;
    }

    // Setter: método que "define" (altera) o valor do name
    // @Setter faria isso automaticamente
    public void setName(String name) {
        this.name = name;
    }

    // equals: compara dois objetos Department (aqui, só pelo id)
    // @EqualsAndHashCode(of = "id") faria isso automaticamente
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    // hashCode: gera um código numérico baseado no id (usado em coleções como HashMap/HashSet)
    // já incluído no @EqualsAndHashCode acima
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // toString: transforma o objeto em texto legível (útil pra debug/log)
    // @ToString faria isso automaticamente
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}