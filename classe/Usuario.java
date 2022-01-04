package classe;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome) && email.equals(usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    //    @Override
//    public boolean equals(Object objeto) {
//        Usuario usuario = (Usuario) objeto;
//
//        return usuario.nome.equals(this.nome) && usuario.email.equals(this.email);
//    }
}
