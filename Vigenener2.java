public class Vigenener2 {
}
    int main(int argc, string argv[])
    {
//проверяем количество аргументов
        if (argc != 2)
        {
            printf("Invalid number of arguments\n");
            return 1;
        }

//исключаем возможность ввода аргумента типа baco1/113
        else
        {
            for (int j=0, m=strlen(argv[1]); j<m; j++)
            {
                //если встречаем не  алфавитную букву
                if (!isalpha(argv[1][j]))
                {
                    printf("Incorrect argument\n");
                    return 1;
                }
            }
        }

        //запрашиваем текст
        string p = get_string("Enter your text\n");

        //объявляем переменную ключа
        string key = argv[1];

        //создаем массив длиной в ключ
        //в нем будет храниться длина шагов
        int steps [strlen(key)];
        for (int k=0, kl=strlen(key); k<kl; k++)
        {
            //если символ ключа строчный
            if (islower(key[k]))
            {
                steps[k] = (char)(key[k]-97);
            }
            //если символ прописной
            else
            {
                steps[k] = (char)(key[k]-65);
            }

        }
        int j = 0;

//приступаем к шифрованию текста
        for (int i=0, n=strlen(p); i<n; i++)
        {
            if (isalpha(p[i]))
            {
                if (islower(p[i]))
                {
                    int ci = (char)(p[i]-97 + steps[j])%26+97;
                    printf ("%c", ci);
                }
                else
                {
                    int ci=(char)(p[i]-65 + steps[j])%26+65;
                    printf("%c", ci);
                }
                //счетчик символов массива ключа увеличивается на 1
                //каждый раз после использования
                j++;
                //если счетчик равен длине ключа, он обнуляется и нарастает заново
                if (j>=strlen(key))
                {
                    j=0;
                }
            }
            //иначе просто выводим символ
            else
            {
                printf ("%c", p[i]);
            }

        }
        printf("\n");
        return 0;
