# Generated by Django 4.0.4 on 2022-05-21 14:22

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='LoginInfo',
            fields=[
                ('username', models.CharField(max_length=10, primary_key=True, serialize=False)),
                ('password', models.CharField(max_length=20)),
            ],
        ),
        migrations.CreateModel(
            name='User',
            fields=[
                ('username', models.CharField(max_length=10, primary_key=True, serialize=False)),
                ('password', models.CharField(max_length=20)),
                ('firstName', models.CharField(max_length=20)),
                ('lastName', models.CharField(max_length=20)),
                ('email', models.CharField(max_length=20)),
                ('isLoggedId', models.BooleanField()),
            ],
        ),
    ]
