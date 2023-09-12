# Continuous 1

## Task 1

$$
xy \mathrm{d}x + (x+1) \mathrm{d}y = 0 \\
(x+1)\mathrm{d}y = -xy\mathrm{d}x \\
\frac{\mathrm{d}y}{y} = \frac{-x\mathrm{d}x}{x+1} \\
\int\frac{\mathrm{d}y}{y} = \int\frac{-x\mathrm{d}x}{x+1} \\
\ln y = -(x - \ln (x+1)) + C_0 \\
\ln y = \ln (x+1) - x + C_0 \\
y = \mathrm{e}^{\ln (x+1) - x + C_0} \\
y = C \frac{x+1}{\mathrm{e}^x} \\
$$

Specific cases:
$$
x = -1 \qquad -y\mathrm{d}x = 0 \qquad 0 = 0 \\
y = 0 \qquad (x+1) \mathrm{d}y = 0 \qquad 0 = 0 \qquad C\mathrm{~can~be~zero} \\
$$
Answer:
$$
y = C \frac{x+1}{\mathrm{e}^x} \\
x = -1
$$


## Task 2

$$
\sqrt{y^2 + 1}\mathrm{d}x = xy\mathrm{d}y \\
\frac{\mathrm{d}x}{x} = \frac{y\mathrm{d}y}{\sqrt{y^2 + 1}} \\
u = y^2 + 1 \qquad \mathrm{d}u = 2y\mathrm{d}y \\
\ln x = \frac{1}{2} \int \frac{1}{\sqrt{u}} \mathrm{d}u \\
\ln x = \frac{1}{2} \cdot 2 \sqrt{u} + C \\
\ln x = \sqrt{y^2 + 1} + C \\
$$

Specific cases:
$$
x = 0 \qquad \sqrt{y^2 + 1}\mathrm{d}x = 0 \qquad 0 = 0 \\
$$
Answer:
$$
\ln x = \sqrt{y^2 + 1} + C \\
x = 0
$$

## Task bacteria

$$
\dot{x} = ax \\
\frac{\mathrm{d}x}{\mathrm{d}t} = ax \\
\frac{\mathrm{d}x}{x} = a\mathrm{d}t \\
\ln x = at + c \\
x = \mathrm{e}^{at}\mathrm{e}^c \\
$$

Initial conditions:
$$
x(0) = \mathrm{e}^c \\
x(0) = 500 \\
c = \ln 500 \\
$$
and
$$
x(3) = \mathrm{e}^{3a} \cdot 500 \\
x(3) = 8000 \\
\mathrm{e}^{3a} = \frac{8000}{500} = 16 \\
a = \frac{1}{3} \ln 16 \\
\mathrm{e}^a = \mathrm{e}^{1/3 \ln 16} = 16^{1/3}
$$
Solution:
$$
x(4) = 500\mathrm{e}^{4a} = 500(\mathrm{e}^{a})^4 = 500 (16^{1/3})^4 = 500 \cdot 16^{\frac{4}{3}} \approx 20159
$$
