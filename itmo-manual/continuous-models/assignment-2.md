# Assignment 2
*Grigorev Mikhail, J4133c*

## Part A

### Equation 1

$$
x \frac{\mathrm{d}x}{\mathrm{d}t} = 1 - t \\
$$

Separatable first-order linear ODE:
$$
x\mathrm{d}x = (1-t) \mathrm{d}t \\
\int x\mathrm{d}x = \int (1-t) \mathrm{d}t \\
\frac{x^2}{2} = t - \frac{t^2}{2} + C_0 \\
x^2 = 2t - t^2 + C_1 \\
x = \pm \sqrt{2t - t^2 + C_1}
$$
Answer:
$$
x = \pm \sqrt{2t - t^2 + C}
$$


### Equation 2

$$
y' - y = 2x - 3 \\
$$

Inseparable non-homogeneous first-order linear ODE. Let's solve a homogeneous ODE:
$$
y' - y = 0 \\
\frac{\mathrm{d}y}{\mathrm{d}x} = y \\
\frac{\mathrm{d}y}{y} = \mathrm{d}x \\
\int\frac{\mathrm{d}y}{y} = \int\mathrm{d}x \\
\ln y = x + C_0 \\
y = C_0\mathrm{e}^{x}
$$
Go back to the initial ODE with $y = \varphi(x) \mathrm{e}^x$:
$$
\Big( \varphi(x) \mathrm{e}^x \Big)' - \varphi(x) \mathrm{e}^x = 2x - 3 \\
\varphi'(x) \mathrm{e}^x + \varphi(x) \mathrm{e}^x - \varphi(x) \mathrm{e}^x = 2x - 3 \\
\varphi'(x) \mathrm{e}^x = 2x - 3 \\
\varphi'(x) = (2x - 3)\mathrm{e}^{-x} \\
\varphi(x) = \int (2x - 3)\mathrm{e}^{-x} \mathrm{d}x \\
$$
Let's compute the latter integral:
$$
u = (2x - 3) \qquad \mathrm{d}u = 2\mathrm{d}x \\
\mathrm{d}v = \mathrm{e}^{-x} \qquad v = -\mathrm{e}^{-x} \\
\int u\mathrm{d}v \equiv uv - \int v\mathrm{d}u \\
\int (2x - 3)\mathrm{e}^{-x} \mathrm{d}x = (3-2x)\mathrm{e}^{-x} + 2\int \mathrm{e}^{-x} \mathrm{d}x = (3-2x)\mathrm{e}^{-x} - 2 \mathrm{e}^{-x} + C_0 \\
$$
 So, $\varphi$:
$$
\varphi(x) = (3-2x)\mathrm{e}^{-x} - 2 \mathrm{e}^{-x} + C_0 \\
y = \varphi(x) \mathrm{e}^x = (3-2x) - 2 + C_0 \mathrm{e}^x \\
y = C_0 \mathrm{e}^x - 2x + 1
$$
Answer:
$$
y = C \mathrm{e}^x - 2x + 1
$$


### Equation 3

$$
y^2 + x^2 y' = xyy'
$$

Inseparable non-homogeneous first-order linear ODE. Let's brush it up:
$$
\Big( \frac{y}{x} \Big)^2 + y' = \frac{y}{x}y' \\
t = \frac{y}{x} \qquad y = tx \qquad y' = t'x + t \\
t^2 + t'x + t = t(t'x + t) \\
t^2 + t'x + t = t'tx + t^2 \\
t'x + t = t'tx \\
\frac{\mathrm{d}t}{\mathrm{d}x}x(t-1) = t \\
\frac{\mathrm{d}t}{t}x(t-1) = \frac{\mathrm{d}x}{x} \\
\int\frac{\mathrm{d}t}{t}(t-1) = \int\frac{\mathrm{d}x}{x} \\
\int\Big( 1 - \frac{1}{t} \Big) \mathrm{d}t = \ln x \\
t - \ln t = \ln x + C
$$
This cannot be simplified, this is the solution. Let's use $x$ and $y$:
$$
\frac{y}{x} - \ln \frac{y}{x} = \ln x + C
$$
Potential solution is $x=0$. Let's check:
$$
y^2 = 0 
$$
Generally, no. Answer:
$$
\frac{y}{x} - \ln \frac{y}{x} = \ln x + C
$$


### Equation 4

$$
(2-9xy^2)x \mathrm{d}x + (4y^2 - 6x^3)y \mathrm{d}y = 0
$$

Let's check if this is an ODE in full differentials:
$$
\underbrace{(2x-9x^2y^2)}_{F'_x} \mathrm{d}x + \underbrace{(4y^3 - 6x^3y)}_{F'_y} \mathrm{d}y = 0 \\
F'_{xy} = -18x^2y \\
F'_{yx} = -18x^2y \\
$$
ODE in full differentials:
$$
F'_x = (2x-9x^2y^2) \\
F(x, y) = \int 2x \mathrm{d}x - 9\int x^2y^2 \mathrm{d}x \\
F(x, y) = x^2 - 3 x^3y^2 + \varphi (y) \\
F'_y = (4y^3 - 6x^3y) \qquad (*) \\
F'_y = \Big( x^2 - 3 x^3y^2 + \varphi (y) \Big)'_y \\
F'_y = -6x^3y + \varphi'_y(y) \qquad (**) \\
(*), (**) \implies 4y^3 - 6x^3y = -6x^3y + \varphi'_y(y) \\
\varphi'_y(y) = 4y^3 \\
\varphi (y) = y^4 + C_0 \\
$$
All in all:
$$
F(x, y) = x^2 - 3 x^3y^2 + y^4 + C_0
$$
Answer:
$$
x^2 - 3 x^3y^2 + y^4 = C
$$


### Equation 5

$$
(2x+1)y' = 4x + 2y \\
y' - \frac{2}{2x+1}y = \frac{4x}{2x+1}
$$

Inseparable non-homogeneous first-order linear ODE. Let's solve a homogeneous ODE:
$$
y' - \frac{2}{2x+1}y = 0 \\
\frac{\mathrm{d}y}{\mathrm{d}x} = \frac{2}{2x+1}y \\
\frac{\mathrm{d}y}{y} = \frac{2\mathrm{d}x}{2x+1} \\
\ln y = \ln (2x+1) + C_0 \\
y = C_1(2x+1)
$$
Go back to the initial ODE with $y = \varphi(x) (2x+1)$:
$$
(2x+1) \Big( \varphi(x) (2x+1) \Big)' = 4x + 2 \varphi(x) (2x+1) \\
(2x+1) \Big( \varphi'(x) (2x+1) + 2\varphi(x) \Big) = 4x + 2 \varphi(x) (2x+1) \\
\varphi'(x) (2x+1)^2 = 4x \\
\varphi'(x) = \frac{4x}{(2x+1)^2} \\
\varphi(x) = 4\int\frac{x}{(2x+1)^2} \mathrm{d}x \\
$$
Let's compute the integral:
$$
\int\frac{x}{(2x+1)^2} \mathrm{d}x = \int \Big( \frac{1}{2(2x+1)} - \frac{1}{2(2x+1)^2} \Big) \mathrm{d}x = \\
= \int \frac{1}{2(2x+1)} \mathrm{d}x - \int\frac{1}{2(2x+1)^2} \mathrm{d}x = \\
= \frac{1}{4} \ln (2x+1) + \frac{1}{4(2x+1)} + C_2
$$
Get back:
$$
\varphi(x) = \ln (2x+1) + \frac{1}{(2x+1)} + C_3
$$
Get back once more:
$$
y = \varphi(x) (2x+1) = (2x+1)\ln (2x+1) + 1 + C_4
$$
Potential solution is $x = -0.5$. Let's check:
$$
0y' = -2 + 2y \\
y = 1 \\
$$
Not necessarily. Answer:
$$
y = (2x+1)\ln (2x+1) + 1 + C
$$


## Part B

### Task 1

### Task 2
