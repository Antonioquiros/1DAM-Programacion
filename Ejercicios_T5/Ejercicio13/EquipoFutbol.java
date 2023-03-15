package EquipoFutbol;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class EquipoFutbol {

    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;

    public EquipoFutbol(String n, double p) {
        this.nombre = n;
        this.presupuesto = p;
        this.empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return this.empleados;
    }

    public void addEmpleado(Empleado e) throws IllegalArgumentException {
        if (e instanceof Entrenador) {
            for (int pos_emp = 0; pos_emp < this.empleados.size(); pos_emp++) {
                Empleado empleado = this.empleados.get(pos_emp);
                if (empleado instanceof Entrenador) {
                    IllegalArgumentException ex = new IllegalArgumentException("Ya existe entrenador");
                    throw ex;
                }
            }
            this.empleados.add(e);
        } else if (e instanceof Futbolista) {
            int num_futbolistas = 0;
            for (int pos_emp = 0; pos_emp < this.empleados.size(); pos_emp++) {
                Empleado empleado = this.empleados.get(pos_emp);
                if (empleado instanceof Futbolista) {
                    num_futbolistas++;
                }
            }
            if (num_futbolistas >= 25) {
                IllegalArgumentException ex = new IllegalArgumentException("No caben mas futbolistas");
                throw ex;
            }
            this.empleados.add(e);
        }
    }

    public void pagarSueldoEmpleados(double s) throws CabreoException {
        int pos_ultimo_empleado_pagado = -1;

        for (int pos_empl = 0; pos_empl < this.empleados.size(); pos_empl++) {
            if (pos_ultimo_empleado_pagado == -1) {
                Empleado empleado = this.empleados.get(pos_empl);
                if (this.presupuesto - s < 0) {
                    pos_ultimo_empleado_pagado = pos_empl - 1;
                } else {
                    empleado.cobrar(s);
                    this.presupuesto = this.presupuesto - s;

                    if (empleado instanceof EmpleadoPrimable) {
                        EmpleadoPrimable empleadop = (EmpleadoPrimable) empleado;
                        if (empleadop.esPrimado()) {
                            if (this.presupuesto - 0.1 * s < 0) {
                                pos_ultimo_empleado_pagado = pos_empl - 1;
                            } else {
                                empleadop.cobrar(s * 0.1);
                            }
                        }
                    }
                }
            }
        }
        if (pos_ultimo_empleado_pagado != -1) {
            int numero_empleados_sin_pagar = this.empleados.size() - pos_ultimo_empleado_pagado;
            double presupuesto_reducido = this.presupuesto / numero_empleados_sin_pagar;

            for (int i = pos_ultimo_empleado_pagado + 1; i < this.empleados.size(); i++) {
                Empleado empleado = this.empleados.get(i);
                empleado.cobrar(presupuesto_reducido);
            }
        }
    }
}
