# Ebola spread modeling

*Grigorev Mikhail*

**Objective:** to create a mathematical model in the form of a system of differential equations to estimate dynamics of cumulative cases and deaths during the Ebola virus epidemic.

The model used in this work is SEIRD (Susceptible, Exposed, Infectious, Recovered, Deceased), a classic simplification in the field of epidemiology. It is based in compartments:

- $S$, Susceptible - people who are targeted by the virus but are not currently diseased.
- $E$, Exposed - people who contacted the virus and are in the incubation stage.
- $I$, Infectious - people who are past the incubation stage and can infect others.
- $R$, Recovered - vaccinated or treated people recovered from the illness.
- $D$, Deceased - people who died during the outbreak.  

The following system of differential equations described said model:
$$
\frac{\mathrm{d}S}{\mathrm{d}t} = -\beta \frac{SI}{N} \\
\frac{\mathrm{d}E}{\mathrm{d}t} = \beta \frac{SI}{N} - \alpha E \\
\frac{\mathrm{d}I}{\mathrm{d}t} = \alpha E - \gamma I - \mu I \\
\frac{\mathrm{d}R}{\mathrm{d}t} = \gamma I \\
\frac{\mathrm{d}D}{\mathrm{d}t} = \mu \frac{\mathrm{d}I}{\mathrm{d}t} \\
$$
where:

- $t$ is time,
- $\beta$ is the transmission rate,
- $N$ is the population,
- $\alpha$ is the incubation rate,
- $\gamma$ is the recovery rate,
- $\mu$ is the death rate.

Initial conditions and bounds for the model (optimized via Nelder-Mead) were:

- 5 705 000, [80000, 11 330 000] for $N$ (we don't know how much of the population was involved in the outbreak in Guinea)
- 0.1, [0, 1] for $\beta$, $\alpha$ and $\mu$
- 0.001, [0, 1] for $\gamma$
- 6480, [0, 11 330 000] for $E_0$ (initial number of Exposed)
- 0, [0, 11 330 000] for $R_0$ (initial number of Recovered)
- $I_0$ (initial number of Infectious) was chosen to be 648 - real data
- $D_0$ (initial number of Deceased) was chosen to be 430 - real data

Data source: [Ebola on Kaggle](https://www.kaggle.com/datasets/imdevskp/ebola-outbreak-20142016-complete-dataset)