import React from 'react';

type Props = {
    message: String;
}

const Hello = ({message}: Props) => (
<h1>Dario {message}!</h1>
);

export default Hello;