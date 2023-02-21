import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-component',
  templateUrl: './segundo-component.component.html',
  styleUrls: ['./segundo-component.component.css']
})
export class SegundoComponentComponent {
  nome = "João";
  dataNascimento = "1995-01-01";
  urlImagem = "/assets/joao.jpg";

  mostrarDataNascimento() {
    alert(`A data de nascimento do João é : ${this.dataNascimento}`)
  }
}
