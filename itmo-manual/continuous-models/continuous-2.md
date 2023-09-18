# Continuous 2

## Solution in full differentials

$$
\underbrace{2xy}_{F'_x}\mathrm{d}x + \underbrace{(x^2 - y^2)}_{F'_y}\mathrm{d}y = 0 \\
\frac{\mathrm{d}}{\mathrm{d}y} 2xy = 2x \\
\frac{\mathrm{d}}{\mathrm{d}x} (x^2 - y^2) = 2x \\
F(x, y) = \int 2xy \mathrm{d}x = yx^2 + \varphi (y) \\
F'_y = x^2 - y^2 = \frac{\mathrm{d}}{\mathrm{d}y} \Big( yx^2 + \varphi(y) \Big) \\
x^2 + \varphi'_y = x^2 - y^2 \\
\varphi'_y = -y^2 \\
\varphi = -\int y^2 \mathrm{d}y = -\frac{1}{3} y^3 \\
F(x, y) = yx^2 - \frac{1}{3} y^3
$$

Answer:
$$
yx^2 - \frac{1}{3} y^3 = C
$$

## First-order linear ODEs

Reminder:
$$
y' + a(x)y = \underbrace{b(x)}_{\mathrm{assume~}0}
$$

### FOLODE 1

$$
xy' - 2y = 2x^4 \\
$$

Assume:
$$
xy' - 2y = 0 \\
x\frac{\mathrm{d}y}{\mathrm{d}x} = 2y \\
\frac{\mathrm{d}y}{y} = \frac{2\mathrm{d}x}{x} \\
\int \frac{\mathrm{d}y}{y} = \int \frac{2\mathrm{d}x}{x} \\
\ln y = 2\ln x + C_0 \\
y = x^2 \mathrm{e}^{C_0} = Cx^2 \\
$$
Go back:
$$
\underbrace{C'(x)x^3 + 2C(x)x^2}_{xy'} - \underbrace{2C(x)x^2}_{2y} = 2x^4 \\
C'(x)x^3 = 2x^4 \\
C'(x) = 2x \\
C(x) = x^2 + M
$$
Answer:
$$
y = (x^2 + M)x^2 = x^4 + Mx^2
$$

## Modeling task

A population of field mice inhabits a certain rural area. In the absence of predators, the mice population increases so that each month (30 days), the population increases by 50%.

However, several owls live in the same area and they kill 15 mice per day. Find an equation describing the population size and use it to predict the long-term behavior of the population.
$$
\frac{\mathrm{d}y}{\mathrm{d}t} = 0.5y - \underbrace{30\cdot 15}_{450} \\
\dot{y} - 0.5y = -450 \\
$$
Assume:
$$
\dot{y} - 0.5y = 0 \\
\frac{\mathrm{d}y}{\mathrm{d}x} = \frac{y}{2} \\
\frac{\mathrm{d}y}{y} = \frac{\mathrm{d}x}{2} \\
\int \frac{\mathrm{d}y}{y} = \int \frac{\mathrm{d}x}{2} \\
\ln y = 0.5x + C_0 \\
\mathrm{e}^{\ln y} = \mathrm{e}^{0.5x + C_0} \\
y = \mathrm{e}^{0.5x} \cdot \underbrace{\mathrm{e}^{C_0}}_C \\
y = C\mathrm{e}^{x/2}
$$
Go back:
$$
y = \varphi (x) \mathrm{e}^{x/2} \\
\dot{y} - 0.5y = -450 \\
\Big( \varphi (x) \cdot \mathrm{e}^{x/2} \Big)' -0.5 \varphi (x) \cdot \mathrm{e}^{x/2} = -450 \\
\underbrace{\varphi' (x) \cdot \mathrm{e}^{x/2} + \varphi (x) \cdot \mathrm{e}^{x/2} \frac{1}{2}}_{\Big( \varphi (x) \cdot \mathrm{e}^{x/2} \Big)'} - \varphi (x) \cdot \mathrm{e}^{x/2} \frac{1}{2} = -450 \\
\varphi' (x) \cdot \mathrm{e}^{x/2} = -450 \\
\varphi' (x) = -450 \cdot \mathrm{e}^{-x/2} \\
\varphi (x) = -450 \int \mathrm{e}^{-x/2} \mathrm{d}x \\
$$
Exchange variables:
$$
u = -x/2 \qquad \frac{\mathrm{d}u}{\mathrm{d}x} = -0.5 \\ \mathrm{d}u = -0.5 \mathrm{d}x \\
\mathrm{d}x = -2\mathrm{d}u \\
\varphi (x) = -450 \int \mathrm{e}^{-x/2} \underbrace{\mathrm{d}x}_{-2\mathrm{d}u} \\
\varphi (u) = 900 \int \mathrm{e}^u \mathrm{d}u \\
\varphi (u) = 900 \mathrm{e}^u + C \\
\varphi (x) = 900 \mathrm{e}^{-x/2} + C \\
$$
Go back:
$$
y = \varphi (x) \mathrm{e}^{x/2} \\
y = \mathrm{e}^{x/2} \Big( 900 \mathrm{e}^{-x/2} + C \Big) = 900 + C\mathrm{e}^{x/2}
$$
Answer:
$$
y = 900 + C\mathrm{e}^{x/2},
$$
where $x$ is time measured in months.
