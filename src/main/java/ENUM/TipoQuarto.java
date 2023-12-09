package ENUM;
public abstract class TipoQuarto {
    private final String descricao;

    protected TipoQuarto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String informacoesAdicionais() {
        return "Informações adicionais do quarto " + descricao + ".";
    }

    public static class Simples extends TipoQuarto {
        public Simples() {
            super("Simples");
        }

        @Override
        public String informacoesAdicionais() {
            return super.informacoesAdicionais() + " Este quarto tem uma cama de solteiro.";
        }
    }

    public static class Duplo extends TipoQuarto {
        public Duplo() {
            super("Duplo");
        }

        @Override
        public String informacoesAdicionais() {
            return super.informacoesAdicionais() + " Este quarto tem uma cama de casal.";
        }
    }

    public static class Suite extends TipoQuarto {
        public Suite() {
            super("Suíte");
        }

        @Override
        public String informacoesAdicionais() {
            return super.informacoesAdicionais() + " Esta suíte inclui uma área de estar privativa.";
        }
    }

    public static class Presidencial extends TipoQuarto {
        public Presidencial() {
            super("Presidencial");
        }

        @Override
        public String informacoesAdicionais() {
            return super.informacoesAdicionais() + " A suíte presidencial é a acomodação mais luxuosa disponível.";
        }
    }
}
