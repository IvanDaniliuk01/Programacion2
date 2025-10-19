# TP7 – Herencia y Polimorfismo (Java)

> Proyecto didáctico en Java para practicar **herencia**, **polimorfismo**, **clases abstractas** e **interfaces**, con demos ejecutables punto por punto.

---

## 🧪 Salidas esperadas (resumen)

**HerenciaBasica – Vehículos**
```
Vehículo: Renault Sandero | Puertas: 5
Puertas (downcast): 5
```

**MetodosAbstractos – Figuras**
```
Área de Círculo(r=2.5) = 19.635
Área de Rectángulo(3.0x4.0) = 12.000
Área de Círculo(r=1.2) = 4.523
Área de Rectángulo(10.0x2.5) = 25.000
```

**Polimorfismo – Empleados**
```
Ana (Planta) -> Sueldo: $920000.00
  Antigüedad años: 5
Luis (Temporal) -> Sueldo: $560000.00
Sofía (Planta) -> Sueldo: $689000.00
  Antigüedad años: 2
```

**comportamientoSobrescrito – Animales**
```
Perro: Fido
Guau!
Gato: Mishi
Miau!
Vaca: Lola
Muu!
```

**Polimorfismo2 – Pagos**
```
Pagando $12345.67 con Tarjeta de Ana (****1111)
Resultado: OK - Medio: TarjetaCredito
Transferencia de $12345.67 desde Banco Nación (CBU 2850590940090418135201)
Resultado: OK - Medio: Transferencia
Pago en efectivo de $12345.67
Resultado: OK - Medio: Efectivo
```

---

## 🎯 Objetivos pedagógicos

- **Herencia (is-a)**: `Auto` hereda de `Vehiculo`; subtipos de `Figura`, `Animal`, etc.
- **Polimorfismo por sobrescritura**: `mostrarInfo()`, `calcularArea()`, `hacerSonido()` implementados según cada subtipo.
- **Clases abstractas**: `Figura` y `Empleado` definen contratos parciales.
- **Interfaces**: `Pagable` unifica comportamientos de pago con distintas implementaciones.
- **Upcasting/Downcasting seguro**: Uso de `instanceof` antes de castear.
- **Genéricos**: `ProcesadorPagos.procesarPago(T extends Pagable)` para aceptar cualquier medio.

---

## 🧱 Decisiones de diseño

- **Separación por responsabilidades**: cada dominio en su set de clases + una `main` pequeña para probar.
- **Simplicidad > complejidad**: ejemplos claros de override/abstract/interface sin lógica innecesaria.
- **Mensajes formateados** (uso de `printf`) para salidas legibles.
- **Valores “hardcodeados”** en las demos para aislar el foco en OOP; podés parametrizarlos por CLI si lo deseás.

---

## 🔧 Cómo extender

- **Vehículos**: agregar `Moto`, `Camioneta`, con atributos propios y override de `mostrarInfo()`.
- **Figuras**: sumar `Triangulo` o `Cuadrado`; mostrar áreas con `List<Figura>` para ver polimorfismo.
- **Empleados**: incluir `EmpleadoComision` con porcentaje variable y bonos.
- **Animales**: añadir `Pato` con `hacerSonido()` y métodos específicos.
- **Pagos**: incorporar `Cripto`, `BilleteraVirtual`; validar montos, simular fallos y registrar historial.

---

## 🧯 Troubleshooting

- **`ClassNotFoundException`**: asegurate de ejecutar desde la misma carpeta donde están los `.class` y usar el nombre exacto de la clase con `main`.
- **Errores de compilación**: verificá nombres de archivo/clase (deben coincidir si marcaste `public`), faltas de ortografía y versiones de Java.
- **Codificación**: si aparecen tildes raras en consola, configurá UTF-8 en tu terminal/IDE.

---

## ✅ Criterios de corrección sugeridos

- Compila sin errores y cada `main` corre correctamente.
- Muestra *herencia*, *polimorfismo*, *clases abstractas* e *interfaces* en ejemplos concretos.
- Código legible: nombres expresivos, comentarios breves, sin duplicación innecesaria.

