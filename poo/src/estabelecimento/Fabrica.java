package estabelecimento;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;
import equipamento.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        Impressora impressora = em;
        
        copiadora.copiar();
        impressora.imprimir();
        digitalizadora.digitalizar();
    }
}
